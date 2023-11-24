
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Raph {

    public static void main(String[] args) {
        
        HashMap<String, String> hashMap;

        ArrayList<String> namesArr = new ArrayList<>();
        namesArr.add("ramjan");
        namesArr.add("khalil");
        namesArr.add("hasim");
        namesArr.add("jasim");
        ArrayList<String> namesArr2 = new ArrayList<>();
        namesArr2.add("ramjan2");
        namesArr2.add("khali2");
        namesArr2.add("hasim2");
        namesArr2.add("jasim2");

        List<ArrayList<HashMap<String, String>>> list = new ArrayList<>();
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

        // create
        for (int i = 0; i < namesArr.size(); i++) {
            hashMap = new HashMap<>();
            hashMap.put("name", namesArr.get(i));
            hashMap.put("name2", namesArr2.get(i));
            arrayList.add(hashMap);
            // arrayList.add(i, hashMap);
            list.add(i, arrayList);
        }
        List<ArrayList<DataModel>> listGet = new ArrayList<>();
        ArrayList<DataModel> arrayListFetch = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            ArrayList<HashMap<String, String>> signArrayList = list.get(i);
            HashMap<String, String> mapValue = signArrayList.get(i);
            String nam = mapValue.get("name");
            String na = mapValue.get("name2");
            DataModel dataModel = new DataModel(nam, na);
            arrayListFetch.add(dataModel);
            listGet.add(i, arrayListFetch);
        }
        System.out.println(list);
        Collections.shuffle(listGet);

        // adapter onBindMethod. it will handle adapter position
        for (int i = 0; i < listGet.size(); i++) {
            ArrayList<DataModel> oneArrayList = listGet.get(i);
            DataModel dataModel = oneArrayList.get(i);
            String nameOf = dataModel.getName();
            String name2Of = dataModel.getName2();
            System.out.println(i + " is " + nameOf + " " + name2Of);
        }

    }
}

class DataModel {
    private String name, name2;

    DataModel(String name, String name2) {
        this.name = name;
        this.name2 = name2;
    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }
}
