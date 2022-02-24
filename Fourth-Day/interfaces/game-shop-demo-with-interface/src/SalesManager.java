
public class SalesManager {
	
	public void addSale(Gamer gamer, Campaign campaign) {
		System.out.println("Sat�� ger�ekle�tirildi: " + gamer.getFirstName() + " Kullan�lan Kampanya: " + campaign.getCampaignName());
	}
	
	public void updateSale(Gamer gamer, Campaign campaign) {
		System.out.println("Sat�� bilgisi g�ncellendi: " + gamer.getFirstName() + " Kullan�lan Kampanya: " + campaign.getCampaignName());
	}
	
	public void deleteSale(Gamer gamer, Campaign campaign) {
		System.out.println("Sat�� bilgisi silindi: " + gamer.getFirstName() + " Kullan�lan Kampanya: " + campaign.getCampaignName());
	}
}
