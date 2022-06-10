package com.microsoft.samples;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(App::generateLog, 0, 10, TimeUnit.SECONDS);
    }

    private static void generateLog() {
        logger.info( "Hello World!" );
    }
}
