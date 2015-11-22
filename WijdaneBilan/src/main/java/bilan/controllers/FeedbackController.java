package bilan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bilan.entities.Feedback;
import bilan.service.IFeedbackService;

@RestController
@RequestMapping("feedbacks")
public class FeedbackController {

@Autowired
private IFeedbackService FeedbackService;


@RequestMapping(value="/{idC}/{idE}", method = RequestMethod.GET)
public Feedback findEvaluationObjectif(@PathVariable("idC") int idC,@PathVariable("idE") int idE){
	return FeedbackService.trouverFeedback(idC, idE);
}


public IFeedbackService getFeedbackService() {
	return FeedbackService;
}


public void setFeedbackService(IFeedbackService feedbackService) {
	FeedbackService = feedbackService;
}



}
