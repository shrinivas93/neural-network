package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class SigmoidFunction implements ActivationFunction {

    @Override
    public Double calculate(Double input) {
        return 1 / (1 + Math.exp(-input));
    }

}
