import org.junit.runner.JUnitcore;
import org.junit.runner.Result;
import org.junit.runnur.notification.Failure;

public class JUnit{
    public static void main(String [] args) {
        Result result = JUnitcore.runClasses(MyClassTest.class);
        for (Failure failure : result.getFailures()){
            System.out.ptintln(failure.toString());
        }
    }
}

