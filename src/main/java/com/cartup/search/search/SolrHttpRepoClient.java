package com.cartup.search.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import com.cartup.commons.constants.SolrFieldConstants;
import com.cartup.commons.extractors.ExtractResponse;

public class SolrHttpRepoClient {
    public static String solrHost = "http://10.110.0.20:8981/solr";
    public static String collection = "product_profile";

    public static JSONArray runQuery(String query) throws Exception {
        HttpURLConnection conn;
        URL nurl = new URL(solrHost + "/" + collection + "/select?");
        conn = (HttpURLConnection) nurl.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        PrintStream ps = new PrintStream(conn.getOutputStream());
        String replacedQuery = query.replaceAll("@spdq", "\\\\\"");
        replacedQuery = query.replaceAll("%5C ", "\\" + "\\ ");
        System.out.println("Spotdy debug query: " + replacedQuery);
        ps.print(replacedQuery);
        ps.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line = null;
        while ((line = br.readLine()) != null) {
            output = output.append(line);
        }
        br.close();

        conn.disconnect();
        String r = ExtractResponse.extractResponseDocs(output.toString());
        JSONObject response = new JSONObject(r);
        if (response.has(SolrFieldConstants.STATUS) && response.getString(SolrFieldConstants.STATUS).equalsIgnoreCase(SolrFieldConstants.FAIL)){
            throw new Exception(response.toString());
        }

        return response.getJSONArray(SolrFieldConstants.RESULT);
    }
}
