#! /bin/bash

echo Starting the command execution : "$@"

gradle :test --tests "CucumberRunnerTest"
