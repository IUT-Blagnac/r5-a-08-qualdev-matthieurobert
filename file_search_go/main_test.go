package main

import (
	"fmt"
	"os"
	"testing"

	"github.com/cucumber/godog"
)

var filename string
var found bool

func iHaveADotfileNamed(arg1 string) error {
	filename = arg1
	return nil
}

func iSearchFor(arg1 string) error {
	_, err := os.ReadFile("/home/matth/" + filename)

	if err != nil {
		found = false
		return err
	}

	// fmt.Print(string(dat))
	found = true

	return nil
}

func iShouldSee(arg1 string) error {
	if found {
		fmt.Println(filename + " found")
		return nil
	} else {
		fmt.Println(filename + " not found")
		return fmt.Errorf("File not found")
	}
}

func InitializeScenario(ctx *godog.ScenarioContext) {
	ctx.Step(`^I have a dotfile named "([^"]*)"$`, iHaveADotfileNamed)
	ctx.Step(`^I search for "([^"]*)"$`, iSearchFor)
	ctx.Step(`^I should see "([^"]*)"$`, iShouldSee)
}

func TestFeatures(t *testing.T) {
	suite := godog.TestSuite{
		ScenarioInitializer: InitializeScenario,
		Options: &godog.Options{
			Format:   "pretty",
			Paths:    []string{"features"},
			TestingT: t, // Testing instance that will run subtests.
		},
	}

	if suite.Run() != 0 {
		t.Fatal("non-zero status returned, failed to run feature tests")
	}
}
