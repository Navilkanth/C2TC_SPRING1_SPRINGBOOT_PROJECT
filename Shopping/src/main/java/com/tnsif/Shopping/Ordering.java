package com.tnsif.Shopping;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
public interface Ordering {
	public static void order() {
		System.out.println("ordering");
	}

}
