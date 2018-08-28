package com.shri.neuralnet.functions.loss;

public interface LossFunction {

    Double calculate(Double[] expected, Double[] actual);

}
