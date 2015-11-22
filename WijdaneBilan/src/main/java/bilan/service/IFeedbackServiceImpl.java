package bilan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bilan.dao.IEvaluationObjectifRepository;
import bilan.dao.IFeedbackRepository;
import bilan.entities.Feedback;

@Service
@Transactional
public class IFeedbackServiceImpl implements IFeedbackService {
	
	@Autowired
	private IFeedbackRepository feedbackRepository;


	@Override
	public Feedback trouverFeedback(int idC, int idE) {
		// TODO Auto-generated method stub
		return feedbackRepository.findFeedback(idC, idE);
	}


	public IFeedbackRepository getFeedbackRepository() {
		return feedbackRepository;
	}


	public void setFeedbackRepository(IFeedbackRepository feedbackRepository) {
		this.feedbackRepository = feedbackRepository;
	}
	
	
	
}
