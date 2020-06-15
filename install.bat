@echo off
cmd /c mvn dependency:purge-local-repository -DmanualInclude="org.thejavaguy.archetype:java8-consoleapp-archetype"
cmd /c mvn clean install archetype:update-local-catalog archetype:crawl
