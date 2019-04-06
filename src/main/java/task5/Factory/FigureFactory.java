package task5.Factory;

import task5.figure.*;
import task5.figure.common.*;
import task5.figure.extrasize.*;

public class FigureFactory {

    public Figure getFigure(char figure) {
         switch (figure){
            case 'i': return new IFigure();
            case 'j': return new JFigure();
            case 'l': return new LFigure();
            case 'o': return new OFigure();
            case 's': return new SFigure();
            case 't': return new TFigure();
            case 'z': return new ZFigure();
            case 'I': return new BigIFigure();
            case 'J': return new BigJFigure();
            case 'L': return new BigLFigure();
            case 'O': return new BigOFigure();
            case 'S': return new BigSFigure();
            case 'T': return new BigTFigure();
            case 'Z': return new BigZFigure();
         }
        // return new OFigure();
        throw new IllegalArgumentException("Illegal character " + figure);
    }


}
