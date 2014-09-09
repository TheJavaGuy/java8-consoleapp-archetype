package ${package};

import com.beust.jcommander.JCommander;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger("App");

    public App() {

    }

    public static void main(String[] args) {
        logger.debug("Hello World! START");
        App app = new App();
        Args objArgs = new Args();
        new JCommander(objArgs, args);
        System.out.println(objArgs.getVerbose() + " " + objArgs.getGroups());
    }
}
