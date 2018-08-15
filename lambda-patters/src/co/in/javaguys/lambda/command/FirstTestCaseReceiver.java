package co.in.javaguys.lambda.command;

public class FirstTestCaseReceiver implements TestCaseReceiver{

	@Override
	public void loadData() {
		System.out.println("Load Data for First Test Case");
		
	}

	@Override
	public void executeTestSteps() {
		System.out.println("Execute Test Steps for First Test Case");
		
	}

	@Override
	public void truncateData() {
		System.out.println("Truncate Data for First Test Case");
		
	}

}
