package com.shri.neuralnet.functions.loss;

import com.shri.neuralnet.functions.loss.impl.SquaredErrorFunction;

public interface LossFunction
{

    LossFunction SQUARED_ERROR = new SquaredErrorFunction();

    Double calculate(Double[] expected, Double[] actual);

}
