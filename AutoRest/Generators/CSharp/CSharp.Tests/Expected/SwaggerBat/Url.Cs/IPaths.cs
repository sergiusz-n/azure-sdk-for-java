namespace Fixtures.SwaggerBatUrl
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// Test Infrastructure for AutoRest
    /// </summary>
    public partial interface IPaths
    {
        /// <summary>
        /// Get true Boolean value on path
        /// </summary>
        /// <param name='boolPath'>
        /// true boolean value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetBooleanTrueWithHttpMessagesAsync(bool? boolPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get false Boolean value on path
        /// </summary>
        /// <param name='boolPath'>
        /// false boolean value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetBooleanFalseWithHttpMessagesAsync(bool? boolPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '1000000' integer value
        /// </summary>
        /// <param name='intPath'>
        /// '1000000' integer value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetIntOneMillionWithHttpMessagesAsync(int? intPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '-1000000' integer value
        /// </summary>
        /// <param name='intPath'>
        /// '-1000000' integer value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetIntNegativeOneMillionWithHttpMessagesAsync(int? intPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '10000000000' 64 bit integer value
        /// </summary>
        /// <param name='longPath'>
        /// '10000000000' 64 bit integer value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetTenBillionWithHttpMessagesAsync(long? longPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '-10000000000' 64 bit integer value
        /// </summary>
        /// <param name='longPath'>
        /// '-10000000000' 64 bit integer value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> GetNegativeTenBillionWithHttpMessagesAsync(long? longPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '1.034E+20' numeric value
        /// </summary>
        /// <param name='floatPath'>
        /// '1.034E+20'numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> FloatScientificPositiveWithHttpMessagesAsync(double? floatPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '-1.034E-20' numeric value
        /// </summary>
        /// <param name='floatPath'>
        /// '-1.034E-20'numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> FloatScientificNegativeWithHttpMessagesAsync(double? floatPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '9999999.999' numeric value
        /// </summary>
        /// <param name='doublePath'>
        /// '9999999.999'numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> DoubleDecimalPositiveWithHttpMessagesAsync(double? doublePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '-9999999.999' numeric value
        /// </summary>
        /// <param name='doublePath'>
        /// '-9999999.999'numeric value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> DoubleDecimalNegativeWithHttpMessagesAsync(double? doublePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value
        /// </summary>
        /// <param name='stringPath'>
        /// '啊齄丂狛狜隣郎隣兀﨩'multi-byte string value. Possible values for this
        /// parameter include: '啊齄丂狛狜隣郎隣兀﨩'
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> StringUnicodeWithHttpMessagesAsync(string stringPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get 'begin!*'();:@ &amp;=+$,/?#[]end
        /// </summary>
        /// <param name='stringPath'>
        /// 'begin!*'();:@ &amp;=+$,/?#[]end' url encoded string value.
        /// Possible values for this parameter include: 'begin!*'();:@
        /// &amp;=+$,/?#[]end'
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> StringUrlEncodedWithHttpMessagesAsync(string stringPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get ''
        /// </summary>
        /// <param name='stringPath'>
        /// '' string value. Possible values for this parameter include: ''
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> StringEmptyWithHttpMessagesAsync(string stringPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null (should throw)
        /// </summary>
        /// <param name='stringPath'>
        /// null string value
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> StringNullWithHttpMessagesAsync(string stringPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get using uri with 'green color' in path parameter
        /// </summary>
        /// <param name='enumPath'>
        /// send the value green. Possible values for this parameter include:
        /// 'red color', 'green color', 'blue color'
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> EnumValidWithHttpMessagesAsync(UriColor? enumPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null (should throw on the client before the request is sent on
        /// wire)
        /// </summary>
        /// <param name='enumPath'>
        /// send null should throw. Possible values for this parameter
        /// include: 'red color', 'green color', 'blue color'
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> EnumNullWithHttpMessagesAsync(UriColor? enumPath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
        /// </summary>
        /// <param name='bytePath'>
        /// '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ByteMultiByteWithHttpMessagesAsync(byte[] bytePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '' as byte array
        /// </summary>
        /// <param name='bytePath'>
        /// '' as byte array
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ByteEmptyWithHttpMessagesAsync(byte[] bytePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null as byte array (should throw)
        /// </summary>
        /// <param name='bytePath'>
        /// null as byte array (should throw)
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> ByteNullWithHttpMessagesAsync(byte[] bytePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '2012-01-01' as date
        /// </summary>
        /// <param name='datePath'>
        /// '2012-01-01' as date
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> DateValidWithHttpMessagesAsync(DateTime? datePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null as date - this should throw or be unusable on the client
        /// side, depending on date representation
        /// </summary>
        /// <param name='datePath'>
        /// null as date (should throw)
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> DateNullWithHttpMessagesAsync(DateTime? datePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get '2012-01-01T01:01:01Z' as date-time
        /// </summary>
        /// <param name='dateTimePath'>
        /// '2012-01-01T01:01:01Z' as date-time
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> DateTimeValidWithHttpMessagesAsync(DateTime? dateTimePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get null as date-time, should be disallowed or throw depending on
        /// representation of date-time
        /// </summary>
        /// <param name='dateTimePath'>
        /// null as date-time
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse> DateTimeNullWithHttpMessagesAsync(DateTime? dateTimePath, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
    }
}
