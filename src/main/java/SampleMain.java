import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleMain {
  public static void main(String args[]){

    List<String> allData= Arrays.asList("a360betatestx@mailinator.com",
            "a360betatestx@mailinator.com",
            "a360betatestguest@mailinator.com",
            "a360betatestmember@mailinator.com",
            "a360betatestguestviewer1@mailinator.com",
            "a360betatestmemberviewer1@mailinator.com",
            "a360betatestx@mailinator.com",
            "a360betatestguest@mailinator.com",
            "a360betatestmember@mailinator.com",
            "a360betatestguestviewer1@mailinator.com",
            "a360betatestmemberviewer1@mailinator.com",
            "a360betatestx@mailinator.com",
            "a360betatestmember@mailinator.com",
            "a360betatestx@mailinator.com",
            "a360betatestx@mailinator.com",
            "a360betatestguest@mailinator.com",
            "a360betatestguestviewer1@mailinator.com",
            "a360betatestx@mailinator.com"
            ).stream().distinct().collect(Collectors.toList());

    System.out.println(allData);

  }
}
