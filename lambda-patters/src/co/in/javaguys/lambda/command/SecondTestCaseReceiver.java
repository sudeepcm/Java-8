package co.in.javaguys.lambda.command;

public class SecondTestCaseReceiver implements TestCaseReceiver{


	@Override
	public void loadData() {
		System.out.println("Load Data for Second Test Case");
		
	}

	@Override
	public void executeTestSteps() {
		System.out.println("Execute Test Steps for Second Test Case");
		
	}

	@Override
	public void truncateData() {
		System.out.println("Truncate Data for Second Test Case");
		
	}

}
