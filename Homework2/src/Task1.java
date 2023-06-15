

public class Task1 {
    // 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть
    // WHERE этого запроса, используя StringBuilder.
    // Данные для фильтрации приведены ниже в виде json-строки.
    // Если значение null, то параметр не должен попадать в запрос.
    // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
    // "city":"Moscow", "age":"null"}

    public static String convertStr(String request) {
        String[] intermediateRes = request.split(",");
        String[] intermediateRes2 = new String[intermediateRes.length];
        for (int i = 0; i < intermediateRes.length; i++) {
            if (intermediateRes[i].split(":")[1].equals("null")) {
                intermediateRes2[i] = "";
            } else {
                intermediateRes2[i] = (intermediateRes[i].split(":")[0] + " = '" + intermediateRes[i].split(":")[1]
                        + "'");
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < intermediateRes2.length - 1; i++) {
            if (intermediateRes2[i + 1] != "") {
                res.append(intermediateRes2[i] + " and ");
            } else {
                res.append(intermediateRes2[i]);
            }
        }
        res.append(intermediateRes2[3]);

        return "select * from students where " + res.toString();
    }

}
