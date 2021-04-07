package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    private static final Marker SQL_MARKER = MarkerManager.getMarker("");

    public static void main(String[] args) throws InterruptedException {
        int iterNumber = 1;
        if (args.length > 0) {
            try {
                iterNumber = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException nfe) {
                System.out.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

        for (int i = 0; i < iterNumber; i++) {
            logger.error(SQL_MARKER, "Zöld erdőben jártam,");
            logger.fatal(SQL_MARKER, "Kék ibolyát láttam,");
            logger.info(SQL_MARKER, "El akart hervadni,");
            logger.warn(SQL_MARKER, "Szabad-e locsolni?");
            Thread.sleep(500);
        }
    }
}
