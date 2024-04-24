/*
* The main program.
*
* @author  Andi Cucka
* @version 1.0
* @since   2024-04-13
*/

function reverseString(stringToReverse: string): string {
    if (stringToReverse === "") {
        return "";
    } else {
        const firstCharacterOfString = stringToReverse[0];
        const restOfString = stringToReverse.slice(1);
        return reverseString(restOfString) + firstCharacterOfString;
    }
}

function main(): void {
    const aString: string = "recursion";

    console.log("");
    console.log(`The original string is: ${aString}`);
    const theReversedString: string = reverseString(aString);
    console.log(`The reversed string is: ${theReversedString}`);

    console.log("\nDone.");
}

main();
