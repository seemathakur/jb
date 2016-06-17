package com.trade.story;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStoryMaps;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;



public class TradeStory extends JUnitStoryMaps {
	
	@Override
	public Configuration configuration()
	{
	return new MostUsefulConfiguration()	
			// where to find the stories
			.useStoryLoader(new LoadFromClasspath(this.getClass()))
			// CONSOLE and TXT reporting
			.useStoryReporterBuilder(
					new StoryReporterBuilder().withDefaultFormats()
							.withFormats(Format.CONSOLE, Format.TXT));
}

// Here we specify the steps classes
@Override
public List <CandidateSteps> candidateSteps() {
	// varargs, can have more that one steps classes
	return new InstanceStepsFactory(configuration(), new TradeStory())
			.createCandidateSteps();
}

@Override
protected List<String> metaFilters() {
	// TODO Auto-generated method stub
	return null;
}

@Override
protected List<String> storyPaths() {
	// TODO Auto-generated method stub
	return null;
}

public void tradeAt(double price) {
	// TODO Auto-generated method stub
	
}
	

	
}


