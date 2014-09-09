package ${package};

import com.beust.jcommander.Parameter;

public class Args {
    @Parameter(names = "-verbose")
    private int verbose = 1;
    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
    private String groups;

    public int getVerbose() {
        return verbose;
    }

    public String getGroups() {
        return groups;
    }
}
