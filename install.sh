#!/bin/bash
mvn dependency:purge-local-repository -DmanualInclude="org.thejavaguy.archetype:java8-consoleapp-archetype"
mvn clean install archetype:update-local-catalog archetype:crawl
