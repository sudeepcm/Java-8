package co.in.javaguys.lambda.command;

public class CommanPatternTester {

	public static void main(String[] args) {
		FirstTestCaseReceiver firstTestCase  = new FirstTestCaseReceiver();
		SecondTestCaseReceiver secondTestCase = new SecondTestCaseReceiver();
		
		TestCaseExecutor firstTestCaseExecutor = new TestCaseExecutor();
		firstTestCaseExecutor.addCommand(firstTestCase::loadData);
		firstTestCaseExecutor.addCommand(firstTestCase::executeTestSteps);
		firstTestCaseExecutor.addCommand(firstTestCase::truncateData);
		firstTestCaseExecutor.run();
		
		TestCaseExecutor secondTestCaseExecutor = new TestCaseExecutor();
		secondTestCaseExecutor.addCommand(secondTestCase::loadData);
		secondTestCaseExecutor.addCommand(secondTestCase::executeTestSteps);
		secondTestCaseExecutor.addCommand(secondTestCase::truncateData);
		secondTestCaseExecutor.run();
	}

}
