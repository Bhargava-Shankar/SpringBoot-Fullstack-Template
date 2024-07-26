package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {
	@Id
	public Integer tutorial_id;
}
