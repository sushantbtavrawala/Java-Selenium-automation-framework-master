package utils;


import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    JSONParser jsonparser = new JSONParser();

    FileReader reader = new FileReader(".//property//TestData.json");
    Object obj = jsonparser.parse(reader);
    JSONObject testdatajsonobj = (JSONObject)obj;

    public String readBrowser() throws IOException, ParseException {
        String browsername = (String) testdatajsonobj.get("browser");
        return browsername;
    }



    public JsonReader() throws IOException, ParseException {
    }
}
