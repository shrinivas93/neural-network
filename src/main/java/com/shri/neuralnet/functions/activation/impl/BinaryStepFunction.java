package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class BinaryStepFunction implements ActivationFunction {

    @Override
    public Double calculate(Double input) {
        return (double) (input < 0 ? 0 : 1);
    }

}
