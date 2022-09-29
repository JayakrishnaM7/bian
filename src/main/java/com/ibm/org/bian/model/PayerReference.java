package com.ibm.org.bian.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayerReference extends AccountRs{
private String PayerReferenceId;
}
