public class Garagiste{
        private  String nom  ;
        private String adresse ;

        public Garagiste(String nom, String adresse){
                this.nom = nom ;
                this.adresse = adresse ;
        }

	public String getNom(){
		return this.nom ;
	}

	public String getAdresse(){
		return this.adresse ;
	}
}

