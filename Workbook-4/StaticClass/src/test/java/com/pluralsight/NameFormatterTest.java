package com.pluralsight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void lastName_firstName_printed_correct_format() {
        //arrange
       String firstName = "Fran";
       String lastName = "Santos";
       String expectedFullName = "Santos, Fran";

       //act
        String actualFullName = NameFormatter.format(firstName,lastName);

        //Assert
        assertEquals(expectedFullName, actualFullName);
    }

    @Test
    public void full_name_prefix_and_suffix_printed_correct_format() {
        String firstName = "Fran";
        String lastName = "Santos";
        String prefix = "Miss";
        String suffix = "Phd";
        String middleName = "D";
        String expectedFullNamePrefixAndSuffix = "Santos, Miss Fran D, Phd";

        //act
        String actualFullNamePrefixAndSuffix = NameFormatter.format(firstName,lastName,prefix,suffix,middleName);
    }

    @Test
    public void full_name_string_input_should_print_correct_format() {
        String inputFullName = "Dr. Mel B Johnson, PhD";
        String expectedFullName = "Johnson, Dr. Mel B, PhD";

        //act
        String actualFullName = NameFormatter.format(inputFullName);

        //assert
        assertEquals(expectedFullName, actualFullName);
    }


}

//Todo :
