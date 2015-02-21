package eu.mondo.sam.proto;

import eu.mondo.sam.core.phases.OptionalPhase;
import eu.mondo.sam.core.phases.iterators.OptionalPhaseIterator;

import java.util.Random;

public class OptionalProtoPhase extends OptionalPhase{
	
	@Override
	public boolean condition() {
		Random rand = new Random();
		int number = rand.nextInt(2);
		System.out.println(number);
		if (number == 1){
			return true;
		}
		return false;
	}

}
