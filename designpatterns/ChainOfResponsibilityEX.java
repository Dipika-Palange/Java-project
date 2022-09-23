package designpatterns;


abstract class Logger
{
	public static  int OUTPUTINFO=1;
	public static  int ERRORINFO=2;
	public static  int DEBUGINFO=3;
	int levels ;
	Logger nextLevelLogger;
	public Logger getNextLevelLogger() {
		return nextLevelLogger;
	}
	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger;
	}
	
	public void logMessage(int levels,String msg)
	{
		if(this.levels<=levels)
		{
			displayLogInfo(msg);
		}
		if(nextLevelLogger!=null)
		{
			nextLevelLogger.logMessage(levels, msg);
		}
	}
	protected abstract void displayLogInfo(String msg);
}

class ConsoleBasedLogger extends Logger
{
	public ConsoleBasedLogger(int levels)
	{
		this.levels=levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("Console Log Info : " +msg);
		
	}
}

class ErrorBasedLogger extends Logger
{
	public ErrorBasedLogger(int levels)
	{
		this.levels=levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("Error Log Info : " +msg);
		
	}
}
class DebugBasedLogger extends Logger
{
	public DebugBasedLogger(int levels)
	{
		this.levels=levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("Debug Log Info : " +msg);
		
	}
}


public class ChainOfResponsibilityEX {
	static Logger doChaining() {
		Logger consoleLogger=new ConsoleBasedLogger(Logger.OUTPUTINFO);
		
		Logger errorLogger=new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);
		
		Logger debugLogger=new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(debugLogger);
		
		return consoleLogger;
			
	}
	
	public static void main(String[] args) {
		Logger chaineLogger=doChaining();
		chaineLogger.logMessage(Logger.OUTPUTINFO, "the sequence of values");
		chaineLogger.logMessage(Logger.ERRORINFO, "an error occured");
		chaineLogger.logMessage(Logger.DEBUGINFO, "debugging is completed ");
	}

}
