package com.shri.neuralnet.functions.util;

import com.shri.neuralnet.functions.activation.ActivationFunction;
import com.shri.neuralnet.functions.activation.impl.ArcTanFunction;
import com.shri.neuralnet.functions.activation.impl.BentIdentityFunction;
import com.shri.neuralnet.functions.activation.impl.BinaryStepFunction;
import com.shri.neuralnet.functions.activation.impl.GaussianFunction;
import com.shri.neuralnet.functions.activation.impl.IdentityFunction;
import com.shri.neuralnet.functions.activation.impl.LeakyReLUFunction;
import com.shri.neuralnet.functions.activation.impl.ReLUFunction;
import com.shri.neuralnet.functions.activation.impl.SigmoidFunction;
import com.shri.neuralnet.functions.activation.impl.SinCFunction;
import com.shri.neuralnet.functions.activation.impl.SinusoidFunction;
import com.shri.neuralnet.functions.activation.impl.SoftPlusFunction;
import com.shri.neuralnet.functions.activation.impl.SoftSignFunction;
import com.shri.neuralnet.functions.activation.impl.TanHFunction;

public enum ActivationFunctions
{
    ARC_TAN(new ArcTanFunction()),
    BENT_IDENTITY(new BentIdentityFunction()),
    BINARY_STEP(new BinaryStepFunction()),
    GAUSSIAN(new GaussianFunction()),
    IDENTITY(new IdentityFunction()),
    LEAKY_RELU(new LeakyReLUFunction()),
    RELU(new ReLUFunction()),
    SIGMOID(new SigmoidFunction()),
    SIN_C(new SinCFunction()),
    SIN(new SinusoidFunction()),
    SOFT_PLUS(new SoftPlusFunction()),
    SOFT_SIGN(new SoftSignFunction()),
    TAN_H(new TanHFunction());

    ActivationFunction function;

    ActivationFunctions(ActivationFunction function)
    {
        this.function = function;
    }

    public ActivationFunction getFunction()
    {
        return function;
    }

}
