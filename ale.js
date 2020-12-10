canHandle(handlerInput){
    return Alexa.getRequestType(handlerInput.requestEnvelope) === 'LaunchRequest';
},

handle(handlerInput){
    const gest = 'Hi .. connect a tune!   Can turn out ice on `es`, Up the yarn on `mii` & to toggle lights `lit`';
    return handlerInput.responseBuilder
    .speak(gest)
    .getResponse();
}