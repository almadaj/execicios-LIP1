function calculate(numA, numB, param){
    if(typeof numA !== 'number' ||typeof numB !== 'number'){
        throw new Error("Must be a number")
    }

    switch(param){
        case '*':
            return numA * numB
        case '/':
            if(numA !== 0){
                return numA / numB
            }else{
                return new Error("0 can't divise")
            }
        case '+':
            return numA + numB
        case '-':
            return numA - numB
        default:
            throw new Error("Type a valid character")
    }
}

try {
    let result = calculate(41, 0, '*')
    console.log("Resultado:", result)
} catch (err) {
    console.error(err)
}