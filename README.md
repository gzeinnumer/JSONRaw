# JSONRaw

- gradle
```gradle
implementation 'com.google.code.gson:gson:2.8.5'
```

- MainActivity.java
```java
String myJson = GblFunction.readFile(MainActivity.this, "raw/my_json.json");
ResponseData myModel = new Gson().fromJson(myJson, ResponseData.class);

((TextView) findViewById(R.id.tv1)).setText(myModel.getList().get(0).getName());
((TextView) findViewById(R.id.tv2)).setText(myJson);
```

- [ResponseData.java](https://github.com/gzeinnumer/JSONRaw/blob/master/app/src/main/java/com/gzeinnumer/jsonraw/model/ResponseData.java) & [ListItem.java](https://github.com/gzeinnumer/JSONRaw/blob/master/app/src/main/java/com/gzeinnumer/jsonraw/model/ListItem.java)

- raw/my_json.json
  - make this file in `assets/raw`.
  - `(left click in) app->new->folder->Assets Folder`
  - make manual folder search with click `Show in explorer` in `assets`

<p align="center">
  <img src="https://github.com/gzeinnumer/JSONRaw/blob/master/preview/example1.png"/>
</p>

```json
{
  "list": [
    {
      "name": "Faraz Khonsari",
      "age": 24
    },
    {
      "name": "John Snow",
      "age": 28
    },
    {
      "name": "Alex Kindman",
      "age": 29
    }
  ]
}
```

- GblFunction.java
```java
public class GblFunction {

    public static String readFile(Activity activity, String fileName) {
        BufferedReader reader;
        StringBuilder content = new StringBuilder();
        try {
            reader = new BufferedReader(new InputStreamReader(activity.getAssets().open(fileName), "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();

    }
}
```

---

```
Copyright 2021 M. Fadli Zein
```