/**********************************************************************************
*
* $Id:$
*
***********************************************************************************
*
 * Copyright (c) 2005, 2006, 2007, 2008 The Sakai Foundation, The MIT Corporation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*
**********************************************************************************/

package org.sakaiproject.tool.gradebook.ui;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

import org.sakaiproject.tool.gradebook.Assignment;
import org.sakaiproject.tool.gradebook.AssignmentGradeRecord;
import org.sakaiproject.tool.gradebook.Gradebook;

import org.sakaiproject.section.api.coursemanagement.EnrollmentRecord;
import org.sakaiproject.section.api.facade.Role;

public class AssignmentGradeRow extends GradebookDependentBean implements Serializable {
	private Assignment assignment;
    private AssignmentGradeRecord gradeRecord;
    private String commentText;
    private Gradebook gradebook;
    private Double score;
    private String letterScore;
    private List eventRows;
    private String eventsLogTitle;
    private boolean userCanGrade;
    // ScoringAgent integration
    private boolean scoringComponentEnabled;
    private String scoringComponentUrl;
    private String retrieveScoreUrl;

		private List<Double> graphScores;
		private List<Double> graphDates;
    private Double averageGrade;
    private Double lowGrade;
    private Double highGrade;

    public AssignmentGradeRow(Assignment assignment, Gradebook gradebook) {
    	this.assignment = assignment;
    	this.gradebook = gradebook;
    	commentText = "";
			initializeGraphArrays();
    }
    public AssignmentGradeRow(Assignment assignment, Gradebook gradebook, boolean userCanGrade) {
    	this.assignment = assignment;
    	this.gradebook = gradebook;
    	commentText = "";
    	this.userCanGrade = userCanGrade;
			initializeGraphArrays();
    }

		public void initializeGraphArrays() {
		  graphScores = new ArrayList();

	    graphScores.add(0.00);
	    graphScores.add(0.00);
	    graphScores.add(0.00);

	    graphScores.add(0.00);
	    graphScores.add(0.00);
	    graphScores.add(0.00);

	    graphScores.add(0.00);
	    graphScores.add(0.00);
	    graphScores.add(0.00);

      graphDates = new ArrayList();

      graphDates.add(0.00);
      graphDates.add(0.00);
      graphDates.add(0.00);

			// List enrollments = getSectionAwareness().getSiteMembersInRole(getGradebookUid(), Role.STUDENT);

			AssignmentGradeRecord gradeRecord;
			String studentUid;
			Double score;
			Double newGradeValue;

      Date submissionDate;
      Double newTimeValue;
      Long timeDifference;

   //    averageGrade = 0.0;
   //    Double numStudents = 0.0;

   //    lowGrade = 100.0;
   //    highGrade = 0.0;

   //    Date dueDate = assignment.getDueDate();

			// for(Iterator iter = enrollments.iterator(); iter.hasNext();) {
			  // studentUid = ((EnrollmentRecord)iter.next()).getUser().getUserUid();
			  //gradeRecord = getGradebookManager().getAssignmentGradeRecordForAssignmentForStudent(assignment, studentUid);
			 //  score = gradeRecord.getGradeAsPercentage();

    //     averageGrade = averageGrade += score;
    //     numStudents++;

    //     if (score < lowGrade){
    //       lowGrade = score;
    //     }
    //     if (score > highGrade){
    //       highGrade = score;
    //     } 

				// if (score < 60.00){
				// 	newGradeValue = graphScores.get(0) + 1.00;
				// 	graphScores.set(0, newGradeValue);
				// }
				// if (score < 65 && score >= 60 ){
				// 	newGradeValue = graphScores.get(1) + 1.00;
				// 	graphScores.set(1, newGradeValue);
				// }
				// if (score < 70 && score >= 65 ){
				// 	newGradeValue = graphScores.get(2) + 1.00;
				// 	graphScores.set(2, newGradeValue);
				// }
				// if (score < 75 && score >= 70 ){
				// 	newGradeValue = graphScores.get(3) + 1.00;
				// 	graphScores.set(3, newGradeValue);
				// }
				// if (score < 80 && score >= 75 ){
				// 	newGradeValue = graphScores.get(4) + 1.00;
				// 	graphScores.set(4, newGradeValue);
				// }
				// if (score < 85 && score >= 80 ){
				// 	newGradeValue = graphScores.get(5) + 1.00;
				// 	graphScores.set(5, newGradeValue);
				// }
				// if (score < 90 && score >= 85 ){
				// 	newGradeValue = graphScores.get(6) + 1.00;
				// 	graphScores.set(6, newGradeValue);
				// }
				// if (score < 95 && score >= 90 ){
				// 	newGradeValue = graphScores.get(7) + 1.00;
				// 	graphScores.set(7, newGradeValue);
				// }
				// if (score >= 95 ){
				// 	newGradeValue = graphScores.get(8) + 1.00;
				// 	graphScores.set(8, newGradeValue);
				// }

    //     submissionDate = gradeRecord.getDateRecorded();

    //     timeDifference = dueDate.getTime() - submissionDate.getTime();
    //     if (timeDifference < 0) {
    //       newTimeValue = graphDates.get(2) + 1.00;
    //       graphDates.set(2, newTimeValue);
    //     }
    //     if (timeDifference >= 0 && timeDifference <= (24*60*60*1000)) {
    //       newTimeValue = graphDates.get(1) + 1.00;
    //       graphDates.set(1, newTimeValue);
    //     }
    //     if (timeDifference > (24*60*60*1000)) {
    //       newTimeValue = graphDates.get(0) + 1.00;
    //       graphDates.set(0, newTimeValue);
    //     }
			// }

      // averageGrade = averageGrade / numStudents; 
	  } 

		public List getGraphScores() {
			return graphScores;
		}

    public List getGraphDates() {
      return graphDates;
    }

    // public Double getAverage() {
    //   return averageGrade;
    // }

    // public Double getLowGrade() {
    //   return lowGrade;
    // }

    // public Double getHighGrade() {
    //   return highGrade;
    // }

    public void setGradeRecord(AssignmentGradeRecord gradeRecord) {
    	this.gradeRecord = gradeRecord;
    }
    // not getAssignment b/c will clash with isAssignment in UI
    public Assignment getAssociatedAssignment() {
    	return assignment;
    }
    public AssignmentGradeRecord getGradeRecord() {
    	return gradeRecord;
    }
    public Gradebook getGradebook() {
    	return gradebook;
    }

    public Double getPointsEarned() {
    	if (gradeRecord == null) {
    		return null;
    	} else {
    		return gradeRecord.getPointsEarned();
    	}
    }
    public Double getGradeAsPercentage() {
    	if (gradeRecord == null) {
    		return null;
    	} else {
    		return gradeRecord.getGradeAsPercentage();
    	}
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Double getScore() {
    	return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}

	public String getLetterScore() {
		return letterScore;
	}
	public void setLetterScore(String letterScore) {
		this.letterScore = letterScore;
	}

	public List getEventRows() {
		return eventRows;
	}
	public void setEventRows(List eventRows) {
		this.eventRows = eventRows;
	}

	public String getEventsLogTitle() {
    	return eventsLogTitle;
    }
	public void setEventsLogTitle(String eventsLogTitle) {
		this.eventsLogTitle = eventsLogTitle;
	}

    /**
     * Used by GradebookItemTable
     * @return false
     */
    public boolean getIsCategory() {
    	return false;
    }

    /**
     * Returns true to align with renderer for GradebookItemTable
     * @return true
     */
    public boolean isAssignment() {
    	return true;
    }

    public boolean isUserCanGrade() {
    	return userCanGrade;
    }
    public void setUserCanGrader(boolean userCanGrade) {
    	this.userCanGrade = userCanGrade;
    }

    /**
     *
     * @return true if a ScoringComponent (such as a rubric from an external scoring service)
     * has been associated with this assignment
     */
    public boolean isScoringComponentEnabled() {
    	return this.scoringComponentEnabled;
    }

    /**
     * true if a ScoringComponent (such as a rubric from an external scoring service)
     * has been associated with this assignment
     * @param scoringComponentEnabled
     */
    public void setScoringComponentEnabled(boolean scoringComponentEnabled) {
    	this.scoringComponentEnabled = scoringComponentEnabled;
    }

    /**
     *
     * @return the URL for grading this assignment and student via an external
     * ScoringAgent, if a ScoringComponent has been associated with this assignment
     */
    public String getScoringComponentUrl() {
    	return this.scoringComponentUrl;
    }

    /**
     * the URL for grading this assignment and student via an external
     * ScoringAgent, if a ScoringComponent has been associated with this assignment
     * @param scoringComponentUrl
     */
    public void setScoringComponentUrl(String scoringComponentUrl) {
    	this.scoringComponentUrl = scoringComponentUrl;
    }
	/**
	 * @return the URL for retrieving the student's score from the external
	 * ScoringComponent
	 */
	public String getRetrieveScoreUrl() {
		return retrieveScoreUrl;
	}
	/**
	 * @param retrieveScoreUrl
	 * the URL for retrieving the student's score from the external
	 * ScoringComponent
	 */
	public void setRetrieveScoreUrl(String retrieveScoreUrl) {
		this.retrieveScoreUrl = retrieveScoreUrl;
	}

}
