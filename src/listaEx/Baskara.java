package listaEx;

public class Baskara {
	


        public double ValorA; 

        public double ValorB;

        public double ValorC;

        public double Delta()
        {
            return ValorB * ValorB - 4 * ValorA * ValorC;
        }

        public double getValorA() {
			return ValorA;
		}

		public void setValorA(double valorA) {
			ValorA = valorA;
		}

		public double getValorB() {
			return ValorB;
		}

		public void setValorB(double valorB) {
			ValorB = valorB;
		}

		public double getValorC() {
			return ValorC;
		}

		public void setValorC(double valorC) {
			ValorC = valorC;
		}

		public double getVarDelta() {
			return VarDelta;
		}

		public void setVarDelta(double varDelta) {
			VarDelta = varDelta;
		}

		public double VarDelta; 

        public double x1()
        {
        	
           return  (-ValorB + Math.sqrt(VarDelta)) / 2 * ValorA;
        }

        public double x2()
        {
            return (-ValorB - Math.sqrt(VarDelta)) / 2 * ValorA;
        }
}
