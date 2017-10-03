package br.edu.univas.si8.ta.fibcalc.rest.impl;

import br.edu.univas.si8.ta.fibcalc.api.FibcalcService;
import br.edu.univas.si8.ta.fibcalc.api.Result;
import br.edu.univas.si8.ta.fibcalc.lib.CalcFibibonacci;

public class FibclacServiceImpl implements FibcalcService{
	
	public Result fib (int num) {
		int result = CalcFibibonacci.fibonacci(num);
		return new Result().withNum(num).withResult(result);
	}

}
