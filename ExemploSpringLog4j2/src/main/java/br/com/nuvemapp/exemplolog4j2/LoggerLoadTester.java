package br.com.nuvemapp.exemplolog4j2;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoggerLoadTester implements CommandLineRunner {

    private static final int ITERATIONS = 100_000;

    @Override
    public void run(String... args) throws Exception {
        final Logger logger = LogManager.getLogger();
        final long start = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            logger.info("Test log message #{}", i);
        }
        final long duration = System.nanoTime() - start;
        final BigDecimal average = BigDecimal.valueOf(duration).divide(BigDecimal.valueOf(ITERATIONS));
        System.out.append("Average time per operation: ").append(average.toPlainString()).append(" ns.\n");
    }
}
