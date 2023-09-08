package io.jenkins.plugins.sample;

import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.RunAction2;

public class HelloWorldAction implements RunAction2 {
    private String name;

    public HelloWorldAction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private transient Run run;

    @Override
    public String getIconFileName() {
        return "document.png";
    }

    @Override
    public String getDisplayName() {
        return "帮助";
    }

    @Override
    public String getUrlName() {
        return "helper";
    }

    @Override
    public void onAttached(Run<?, ?> r) {
        this.run = run;
    }

    @Override
    public void onLoad(Run<?, ?> r) {
        this.run = run;
    }

    public Run getRun() {
        return run;
    }
}
