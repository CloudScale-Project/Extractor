package org.somox.core;

import org.somox.core.furtherRequired.IRequiredExt2;



public class WithCore {
	IRequiredExt2 irqe2;
	
	public void withCore() {
		Core c = new Core();
		c.doProvided();
	}
	
	public void withCore2() {
		irqe2.doSth();
	}

}
