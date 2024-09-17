package dominio;

		public class Clube {
			private String nome;
			private int vitorias;
			private int derrotas;
			private int empates;
    
    	public Clube(String nome, int vitorias, int derrotas, int empates) {
    		this.nome = nome;
    		this.vitorias = vitorias;
    		this.derrotas = derrotas;
    		this.empates = empates;
    	}
    
        public int calcularTotalPontos() {
            return (vitorias * 3) + empates;  
        }
        
        public int calcularTotalJogos(){
        	return vitorias + derrotas + empates;
        }

        
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        
        public int getVitorias() {
            return vitorias;
        }
        public void setVitorias(int vitorias) {
            this.vitorias = vitorias;
        }

        
        public int getDerrotas() {
            return derrotas;
        }
        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }

        
        public int getEmpates() {
            return empates;
        }
        public void setEmpates(int empates) {
            this.empates = empates;
        }
    }

