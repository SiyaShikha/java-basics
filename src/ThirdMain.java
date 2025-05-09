import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ThirdMain {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("shikha");
        arrayList.add("rohini");
        System.out.println(arrayList.contains("shikha"));
        System.out.println(arrayList.hashCode());
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
