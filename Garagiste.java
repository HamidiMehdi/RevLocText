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

	public void setNom(String nom){
		this.nom = nom ;
	}

	public void setAdresse(String adresse){
		this.adresse = adresse ;
	}

}

