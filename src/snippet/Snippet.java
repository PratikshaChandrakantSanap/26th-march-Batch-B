package snippet;

public class Snippet {
	@Override
		public void onTestFailure(ITestResult result) {
			Reporter.log("Test passed successful", true);
		}
}

