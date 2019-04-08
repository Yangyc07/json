package json;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class ReadJSONSample {
    public static void main(String []args) throws IOException {

        File file = new File(ReadJSONSample.class.getResource("/json.json").getFile());
        String content = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(content);

        //判断是否为空
        if(!jsonObject.isNull("hehe")){
            System.out.println("姓名是："+jsonObject.getString("name"));
        }


        JSONArray majorArray = jsonObject.getJSONArray("major");
        for (int i = 0; i < majorArray.length() ; i++) {
            String major = (String) majorArray.get(i);
            System.out.println(major);
        }
    }
}
