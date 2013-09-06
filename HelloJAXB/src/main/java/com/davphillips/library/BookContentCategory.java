package com.davphillips.library;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "contentCategory")
@XmlEnum
public enum BookContentCategory {

	FICTION, NON_FICTION
}
