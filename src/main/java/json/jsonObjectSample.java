package json;

import bean.Student;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class jsonObjectSample {

    public static void main(String []args) throws JSONException {
        //JsonObject();
        //createJsonByMap();
        createJsonByBean();
    }

//    {
//        "name":"杨亚宸",
//            "age":21,
//            "birthday":"1997-06-26",
//            "school":"江陵一中",
//            "major":["泡妞","学习"],
//        "has_girlfriend":false,
//            "car":null,
//            "house":null,
//            "comment":"这是一个注释"
//    }
//
    private static void JsonObject() throws JSONException {

        JSONObject yangyachen = new JSONObject();
        Object nullObj = null;
        yangyachen.put("name","yangyachen");
        yangyachen.put("age",21);
        yangyachen.put("birthday","1997-06-26");
        yangyachen.put("school","江陵一中");
        yangyachen.put("marjor",new String[]{"泡妞","学习"});
        yangyachen.put("has_girfriend",false);
        yangyachen.put("car",nullObj);
        yangyachen.put("car",nullObj);
        yangyachen.put("comment","这是一个注释");

        System.out.println(yangyachen.toString());//输出顺序不同
        //{"birthday":"1997-06-26","has_girfriend":false,"marjor":["泡妞","学习"],"school":"江陵一中","name":"yangyachen","comment":"这是一个注释","age":21}
    }

    private static void createJsonByMap(){
        Map<String, Object> yangyachen = new HashMap<String, Object>();
        Object nullObj = null;
        yangyachen.put("name","yangyachen");
        yangyachen.put("age",21);
        yangyachen.put("birthday","1997-06-26");
        yangyachen.put("school","江陵一中");
        yangyachen.put("marjor",new String[]{"泡妞","学习"});
        yangyachen.put("has_girfriend",false);
        yangyachen.put("car",nullObj);
        yangyachen.put("car",nullObj);
        yangyachen.put("comment","这是一个注释");

        System.out.println(new JSONObject(yangyachen).toString());
    }

    private static void createJsonByBean(){
        Student student = new Student();
        student.setAge(20);
        student.setBirthday("1997-06-26");
        student.setCar(null);
        student.setMajor(new String[]{"泡妞", "学习"});
        student.setComment("这是一个注释");
        student.setHas_girlfriend(false);
        student.setHouse(null);
        student.setSchool("江陵一中");
        student.setName("杨亚宸");
        System.out.println(new JSONObject(student));
    }

}
