package lesson4_assignment3.concretes;

import lesson4_assignment3.abstracts.CampaignService;
import lesson4_assignment3.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi:  " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi:  " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi:  " + campaign.getName());
		
	}

}
