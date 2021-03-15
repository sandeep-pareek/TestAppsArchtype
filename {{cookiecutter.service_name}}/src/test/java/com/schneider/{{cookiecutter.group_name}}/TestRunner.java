package com.schneider.{{cookiecutter.group_name}};

import com.schneider.runner.StaffTestRunner;

class TestRunner extends StaffTestRunner {
    public TestRunner() {
        super("classpath:com/schneider/{{cookiecutter.group_name}}", "~@ignore", 1, "{{cookiecutter.project_description}}");
    }
}
